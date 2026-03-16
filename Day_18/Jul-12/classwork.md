## Agenda

- Connecting to Remote MySQL Server
- JDBC

### Connecting to Remote MySQL Server

#### Step 1: Set up MySQL server

- Login on server with "root" (admin) user.

```SQL
CREATE DATABASE myproject;
-- create new db

CREATE USER myprojectuser@'%' IDENTIFIED BY 'Passw@rd123';
-- create new user which can access db from any machine (%)

GRANT ALL ON myproject.* TO myprojectuser@'%';
-- give full permissions to the user on that database

FLUSH PRIVILEGES;
-- activate permissions immediately

EXIT;
-- root user exit/logout
```

- By default, MySQL server is accessible only from current machine.

  - Need to configure it so that it can be accessed from any other machine (in same network).
  - Config file: `C:\ProgramData\MySQL\MySQL Server 8.4\my.ini`

    ```
    [mysqld]

    bind-address=0.0.0.0
    ```

  - Server needs to restart after changing config file.

#### Step 2: Connect from client machine

- From any machine in the same network.

  > mysql -h serveripaddr -u myprojectuser -pPassw@rd123

  ```SQL
    SHOW DATABASES;

    USE myproject;

    -- create tables ...
  ```

### JDBC - Java Database Connectivity

- JDBC is standard/specification for connecting Java Application to any RDBMS.
- JDBC Programming Steps

  - 0. Download appropriate JDBC driver and add it into your project.
    - https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.4.0
    - Download "jar".
    - Project (right click) -> Properties -> Java Build Path -> Libraries -> Add External Jars -> Select the Jar -> OK.
  - 1. Load and register driver class.
    - One time step for the whole application --> `static` block.
    - When class is loaded, it is auto-registered.
      ```Java
      static {
        Class.forName("com.mysql.cj.jdbc.Driver"); // load the class
      }
      ```
  - 2. Create database connection using DriverManager.
    ```Java
    url = "jdbc:mysql://localhost:3306/aids"; // jdbc:mysql://serverip:3306/dbname
    user = "root";
    passwd = "nilesh"; // db passwd: e.g. manager
    Connection con = DriverManager.getConnection(url, user, passwd);
    ```
  - 3. Create the statement (SQL query).
    ```Java
    sql = "INSERT ..."; // DML OR
    sql = "SELECT ..."; // DQL
    PreparedStatement stmt = con.prepareStatememnt(sql);
    ```
  - 4. Execute the query and process result.

    ```Java
    // set query params/placeholders
    int count = stmt.executeUpdate(); // Non-SELECT: returns num of affected rows
    // OR
    ResultSet rs = stmt.executeQuery(); // SELECT query
    while(rs.next()) {  // fetch next row
        int val1 = rs.getInt("col1name");
        String val2 = rs.getString("col2name");
        double val3 = rs.getDouble("col3name");
        // ...
    }
    rs.close();
    ```

  - 5. Close statement and connection.
    ```Java
    stmt.close();
    con.close();
    ```

#### Step1: Prepare database -- from MySQL CLI

- **ECommerce**
  - products (id, name, price)
  - users (id, name, email, passwd, addr)
  - orders (id, user_id, prod_id, order_dt, status)

```SQL
CREATE TABLE products(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40), price DECIMAL(8,2));

CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(80), email VARCHAR(40), passwd VARCHAR(20), addr VARCHAR(100));

CREATE TABLE orders(id INT PRIMARY KEY AUTO_INCREMENT, user_id INT, prod_id INT, order_dt DATETIME, status VARCHAR(20));
-- status: Pending, Dispatched, Delivered
```

#### Step2: Write Java Application to perform db operations.

- Refer the code.
