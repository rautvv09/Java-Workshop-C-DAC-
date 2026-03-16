### emp and dept tables

```SQL
CREATE TABLE dept(deptno INT(4), dname VARCHAR(40), loc VARCHAR(40));

INSERT INTO dept VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES (20,'RESEARCH','DALLAS');
INSERT INTO dept VALUES (30,'SALES','CHICAGO');
INSERT INTO dept VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE emp(empno INT(4), ename VARCHAR(40), job VARCHAR(40), mgr INT(4), hire DATE, sal DECIMAL(8,2), comm DECIMAL(8,2), deptno INT(4));

INSERT INTO emp VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800.00,NULL,20);
INSERT INTO emp VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600.00,300.00,30);

INSERT INTO emp VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250.00,500.00,30);
INSERT INTO emp VALUES (7566,'JONES','MANAGER',7839,'1981-04-02',2975.00,NULL,20);
INSERT INTO emp VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250.00,1400.00,30);
INSERT INTO emp VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850.00,NULL,30);
INSERT INTO emp VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09',2450.00,NULL,10);
INSERT INTO emp VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000.00,NULL,20);
INSERT INTO emp VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000.00,NULL,10);
INSERT INTO emp VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500.00,0.00,30);
INSERT INTO emp VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100.00,NULL,20);
INSERT INTO emp VALUES (7900,'JAMES','CLERK',7698,'1981-12-03',950.00,NULL,30);
INSERT INTO emp VALUES (7902,'FORD','ANALYST',7566,'1981-12-03',3000.00,NULL,20);
INSERT INTO emp VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300.00,NULL,10);
```

```SQL
SHOW TABLES;

DESCRIBE dept;

SELECT * FROM dept;

DESCRIBE emp;
```

### ORDER BY clause

```SQL
SELECT * FROM emp;

SELECT * FROM emp ORDER BY deptno;

SELECT * FROM emp ORDER BY hire;

SELECT * FROM emp ORDER BY sal DESC;

SELECT * FROM emp ORDER BY deptno, job;
```

### LIMIT clause

```SQL
SELECT ename, job, sal FROM emp;

SELECT ename, job, sal FROM emp LIMIT 5;
-- first 5 rows

SELECT ename, job, sal FROM emp LIMIT 2,3;
-- skip first 2 rows, then get next 3 rows

SELECT ename, job, sal FROM emp
ORDER BY sal DESC
LIMIT 1;
-- get emp with highest sal

SELECT ename, job, sal FROM emp
ORDER BY sal ASC
LIMIT 3;
-- get 3 emps with lowest sals

SELECT ename, job, sal FROM emp
ORDER BY sal DESC
LIMIT 1, 2;
-- get 2 emps with highest sal except the topmost one
```

### Projection

- Which columns to display...
  - "\*" means all columns.
- Computed column, Derived column, Virtual column, Pseudo column.
  - `AS` keyword is optional.

```SQL
SELECT ename, sal, comm FROM emp;

SELECT ename, sal, sal * 0.1 AS tax FROM emp;
-- display sal, tax=10% of sal of all emps.

SELECT ename, sal, comm, sal + comm income FROM emp;

SELECT ename, sal, comm, COALESCE(comm,0) com FROM emp;

SELECT ename, sal, comm, sal + COALESCE(comm,0) com FROM emp;
```

### DISTINCT rows

```SQL
SELECT DISTINCT deptno FROM emp;

SELECT DISTINCT job FROM emp;

SELECT DISTINCT deptno, job FROM emp;
```

### NULL values

- NULL value indicate absence of the value.
- NULL is not zero, not empty string.
- NULL cannot be used with arithemtic & relational operators.
- NULL should be handled with special operators like `IS NULL`, `IS NOT NULL` and special functions like `COALESCE()`, ...
- COALESCE() function takes any number of args, but returns first non-null value.
  - COALESCE(NULL, NULL, 100) -> 100
  - COALESCE(NULL, 200, 100) -> 200
  - COALESCE(300, 200, 100) -> 300
- NULL values are ignored by GROUP functions.

### WHERE clause

```SQL
SELECT ename, sal FROM emp
WHERE sal < 1000;

SELECT ename, job, sal, comm FROM emp
WHERE comm IS NULL;
-- find emp with no comm

SELECT ename, job, sal, comm FROM emp
WHERE comm IS NOT NULL;
-- find emp with comm
```

```SQL
SELECT ename, job, sal FROM emp
WHERE sal >= 1000 AND sal <= 1500;
-- find emps whose sal between 1000 to 1500

SELECT ename, job, sal FROM emp
WHERE sal BETWEEN 1000 AND 1500;
-- BETWEEN operator -- for range checking

SELECT ename, hire, sal FROM emp
WHERE hire BETWEEN '1981-01-01' AND '1981-12-31';
-- find emps hired in 1981
```

```SQL
SELECT ename, job, sal FROM emp
WHERE job = 'CLERK' OR job = 'ANALYST' OR job = 'PRESIDENT';
-- find all CLERK, ANALYST, PRESIDENTs

SELECT ename, job, sal FROM emp
WHERE job IN ('CLERK', 'ANALYST', 'PRESIDENT');
-- IN operator -- for equality check with multiple values for a column

SELECT ename, job, sal FROM emp
WHERE job NOT IN ('CLERK', 'ANALYST', 'PRESIDENT');
-- find emps who are not CLERK, ANALYST, PRESIDENTs
```

- LIKE operator wildcards
  - `%` -- any num of any chars
  - `_` -- any single char

```SQL
SELECT ename, sal FROM emp
WHERE ename LIKE 'M%';
-- find all emps whose names start with M

SELECT ename, sal FROM emp
WHERE ename LIKE '%U%';
-- find all emps whose name contains U

SELECT ename, sal FROM emp
WHERE ename LIKE '%A%A%';
-- find all emps whose name contains A twice.

SELECT ename, sal FROM emp
WHERE ename LIKE '____';
-- find all emps whose name is of 4 letters.
```

### HELP

```SQL
HELP Functions;

HELP String Functions;

HELP Date and Time Functions;
```

### SQL Functions

- Single Row Fns a.k.a. Scalar Fns

  - "n" input rows --> "n" output rows

  ```SQL
  SELECT ename, LENGTH(ename) FROM emp;

  SELECT CONCAT(ename, ' - ', job) FROM emp;

  SELECT ename, hire, YEAR(hire) FROM emp;
  ```

- Multi Row Fns a.k.a. Aggregate Fns a.k.a. Group Fns

  - m input rows --> n ouTput rows
    - n <= m
  - SUM(), MAX(), MIN(), AVG(), COUNT()
  - STDEV(), CORR(), ...

  ```SQL
  SELECT SUM(sal) FROM emp;

  SELECT AVG(sal) FROM emp;

  SELECT COUNT(sal), MAX(sal), MIN(sal) FROM emp;

  SELECT COUNT(comm), MAX(comm), MIN(comm), SUM(comm), AVG(comm) FROM emp;
  ```

- Table Fns

  - "n" input rows --> "m" output rows.
    - m >= n
  - Not supported in MySQL.

### GROUP BY clause

- Performs aggregate operations on group of rows.
  - e.g. deptwise total sal.
  - e.g. jobwise avg sal.

```SQL
SELECT deptno, SUM(sal) FROM emp
GROUP BY deptno;

SELECT job, AVG(sal) FROM emp
GROUP BY job;

SELECT deptno, COUNT(empno), SUM(sal), AVG(sal), MIN(sal), MAX(sal) FROM  emp
GROUP BY deptno;

SELECT deptno, COUNT(empno), SUM(sal), AVG(sal), MIN(sal), MAX(sal) FROM  emp
GROUP BY deptno
ORDER BY deptno;
```

```SQL
SELECT deptno, job, COUNT(empno) AS cnt
FROM emp
GROUP BY deptno, job;

SELECT deptno, job, COUNT(empno) AS cnt
FROM emp
GROUP BY deptno, job
ORDER BY deptno, job;
```

- Limitation:
  - GROUP BY is designed for summarising the data. But you will loose/miss the details i.e. cannot fetch single column with group operations.
    ```SQL
    SELECT deptno, ename, SUM(sal) FROM emp
    GROUP BY deptno;
    -- Error
    ```
  - This Limitation can be overcome using "Window functions".

### HAVING clause

- to filter based on condition on aggregate results -- HAVING clause.

```SQL
SELECT job, COUNT(empno) FROM emp
GROUP BY job
HAVING COUNT(empno) >= 3;
-- display jobs that have 3 or more num of emps.

SELECT deptno, SUM(sal) FROM emp
GROUP BY deptno
HAVING SUM(sal) > 10000.0;
```

- to filter based on condition on individual record -- WHERE clause.

```SQL
SELECT job, AVG(sal) FROM emp
WHERE deptno IN (10, 20)
GROUP BY job
HAVING AVG(sal) > 2000.0;
-- display jobs whose avg sal > 2000.0 considering only emps from deptno 10 & 20.
```

### Joins

- Fetch data from Multiple tables in single query.
- Join Types
  - INNER join -- rows matching from both tables
  - OUTER join
    - LEFT join -- rows matching from both tables + additional rows from left table
    - RIGHT join -- rows matching from both tables + additional rows from right table
    - FULL join -- rows matching from both tables + additional rows from left table + additional rows from right table
  - SELF join
  - CROSS join

```SQL
SELECT * FROM dept;

SELECT ename, job, sal, deptno FROM emp;

SELECT ename, dname FROM emp
INNER JOIN dept ON deptno = deptno;
-- ERROR: Column 'deptno' in on clause is ambiguous

SELECT ename, dname FROM emp
INNER JOIN dept ON emp.deptno = dept.deptno;
-- when column name is same in both tables, writing tablename with colname is mandatory

SELECT emp.ename, dept.dname FROM emp
INNER JOIN dept ON emp.deptno = dept.deptno;
-- using tablename with colname makes query more readable.

SELECT e.ename, d.dname FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno;
-- table aliases can be used for short-hand
-- inner join -- matching 14 rows

SELECT e.ename, d.dname FROM emp e
RIGHT JOIN dept d ON e.deptno = d.deptno;
-- right join -- matching 14 rows + 1 extra row from right table (dept).

SELECT e.ename, d.dname FROM emp e
LEFT JOIN dept d ON e.deptno = d.deptno;
-- left join -- matching 14 rows + extra row from left table (emp) but no extra.
```

```SQL
SELECT deptno, COUNT(empno) FROM emp
GROUP BY deptno;

SELECT d.dname, COUNT(e.empno) cnt
FROM emp e
INNER JOIN dept d ON e.deptno=d.deptno
GROUP BY d.dname;

SELECT d.dname, COUNT(e.empno) cnt
FROM emp e
RIGHT JOIN dept d ON e.deptno=d.deptno
GROUP BY d.dname;
```

### Sub-query

- Query in another query.

```SQL
SELECT MAX(sal) FROM emp;

SELECT * FROM emp WHERE sal = 5000.0;

SELECT * FROM emp WHERE sal = (SELECT MAX(sal) FROM emp);
-- find emp with highest sal

SELECT DISTINCT sal FROM emp ORDER BY sal DESC LIMIT 1,1;

SELECT * FROM emp WHERE sal = (SELECT DISTINCT sal FROM emp ORDER BY sal DESC LIMIT 1,1);
-- find emp with second highest sal


SELECT DISTINCT sal FROM emp ORDER BY sal DESC LIMIT 2,1;

SELECT * FROM emp WHERE sal = (SELECT DISTINCT sal FROM emp ORDER BY sal DESC LIMIT 2,1);
-- find emp with third highest sal
```
