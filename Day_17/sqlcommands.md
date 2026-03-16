```SQL
SELECT VERSION();

SHOW DATABASES;

CREATE DATABASE aids;

SHOW DATABASES;

SELECT DATABASE(), USER();

USE aids;

SELECT DATABASE(), USER();

SHOW TABLES;
```

- CREATE TABLE tablename(col1name COL1TYPE, col2name COL2TYPE, ...);

- DROP TABLE tablename;

- **Data Types**
  - Numeric Types
    - \* INT (4), SMALLINT (2)
    - TINYINT (1), BIGINT (4)
    - FLOAT (4), \* DOUBLE (8)
    - \* DECIMAL(m, n)
    - BOOL (1)
  - String Types
    - \* CHAR(n) - max size 256 chars
    - \* VARCHAR(n) - max size 65535 chars
    - TEXT - max size 4 GB
  - Binary Types
    - BINARY(n), VARBINARY(n)
    - BLOB - max size 4 GB
  - Date Time Types
    - \* DATE
    - TIME
    - \* DATETIME, TIMESTAMP
  - Misc Types

```SQL
CREATE TABLE products(id INT, name VARCHAR(40), price DOUBLE);

SHOW TABLES;

DESCRIBE products;

-- PRIMARY KEY: Unique identity
--  Cannot be empty, Cannot be duplicate

DROP TABLE products;

CREATE TABLE products(id INT PRIMARY KEY, name VARCHAR(40), price DOUBLE);

DESCRIBE products;
```

- INSERT INTO tablename VALUES (col1value, col2value, ...);
  - Strings, Date/Time must be in 'single quotes'.

```SQL
INSERT INTO products VALUES (1, 'iPhone16', 89000.0);

INSERT INTO products VALUES (2, 'Pixel13', 95000.0);

INSERT INTO products VALUES (3, 'Pen', 10.0), (4, 'Pencil', 4.0), (5, 'Notebook', 50.0);
```

- SELECT col1name, col2name, ... FROM tablename;
- SELECT \* FROM tablename;
  - \* means all columns

```SQL
SELECT * FROM products;

SELECT * FROM products ORDER BY price;

SELECT * FROM products ORDER BY price DESC;

SELECT * FROM products ORDER BY name;
```

```SQL
INSERT INTO products VALUES (6, 'Pen', 20.0), (7, 'Pen', 5.0), (8, 'Pencil', 5.0);

-- sort by name (asc), price (desc).
SELECT * FROM products
ORDER BY name ASC, price DESC;
```

- WHERE clause
  - Filter the rows based on condition

```SQL
SELECT * FROM products WHERE name='Pen';

SELECT * FROM products WHERE price<100.0;

SELECT * FROM products WHERE price>=10.0 AND price<=100.0;
```

- UPDATE tablename SET col1name=newcol1val, col2name=newcol2val, ... WHERE condition;

```SQL
SELECT * FROM products;

-- change iPhone16 price to 79000.
UPDATE products SET price=79000 WHERE name='iPhone16';

SELECT * FROM products;

-- increase price of all pens by 2 rs.
UPDATE products SET price=price+2 WHERE name='Pen';

SELECT * FROM products;

-- increase price of all products by 5%.
UPDATE products SET price=price+price*0.05;

SELECT * FROM products;
//
UPDATE products SET name='Big Notebook', price=65.0 WHERE id=5;

SELECT * FROM products;
```

- DELETE FROM tablename WHERE condition;

```SQL
DELETE FROM products WHERE name='Pixel13';

SELECT * FROM products;

DELETE FROM products WHERE name='Pencil';

SELECT * FROM products;

DELETE FROM products WHERE price > 10000;

SELECT * FROM products;

DELETE FROM products;

SELECT * FROM products;
```

```SQL
TRUNCATE TABLE products;

DESCRIBE products;

DROP TABLE products;

SHOW TABLES;

```
