# OOP (Java)

### Concept #1: Types of Languages and How They Work

- Java :: Compiled into ByteCode (.class file)
  -  Speed is comparatively slower than C
  -  Env is JRE
- C :: Compiled into Native OS code 
  - Speed of execution is highest
- TypeScript :: Programming language which is an extension of JS 
  - Runs on the nodeJS env
  - Transpiled into the browser for execution
- Kotlin :: JRE

### Concept #2: Byte Code in Java

- Source Code: File2.java
- Byte code: A.class, B.class, C.class
  
The number of byte code generated after compilation is equal to the number of classes written in the source code.

### Concept #3: Debugging public classes

- Debugging in public classes must be done as quickly as possible to prevent failures.
- For the purpose of debugging public class, we can write multiple classes in the same source code; but only one class among them can be public.

### Concept #4: Implicit vs Explicit Casting:

- Implicit casting is done when the compiler directly converts a data type into another.
- Explicit casting is done when specified by the user.
  - Incompatible types: double to float

### Concept #5: Special Characters

- Underscore can be used in between integer values to increase readabiliity. Note that this does not affect the value of the number.
  - If present at the end: Illegal reference
  - If present in the beginning: Treated as a variable

### Concept #6: Method Overloading

- Java supports **method overloading**, but NOT **operator overloading**.
- The + operator is used to perform **addition.**
- The operation being performed is addition, but the result appears as concatenation.
- Precedence of the operator also matters on the final result. 
  Example:
  > System.out.println(10 + 20 + "Hello World" + 10 + 20);

  Result:
  > "30Hello World1020"

### Concept #7: ```System.out.print()``` and its variants

- ```print()```: Cursor prints the object at the current position and moves it by one position to the right.
  - Cannot be **empty.** (i.e. it has to have at least one argument.)
- ```println()```: Cursor prints the object at the current position and moves it to the next line.
  - Can be empty. It just moves the cursor to the next line. 

### Concept #8: Scope of Variables

- **Local Variables:** 
  - Declaration + No Initialization = No error
  - Utilization = CTE :: var might not be initialized
  
- **Global Variables:**
  - Declaration + No Initialization = No error,
  - Utilization = No error (default value is set to 0).
    This is because the compiler assumes that some other function might utilize this variable parallely (in case of mulithreading) or during execution.

**Primitive Types :: Single Values :: Default Value(s):**
- byte, short, long, int :: 0
- float, double :: 0.0
- char :: space
- Boolean :: false

**Non Primitive Types :: Multiple Values :: Default Value(s):**
- **Derived:**
  - arrays :: empty , null 
- **User defined:**
  - arrays :: empty, null

### Concept #9: Use of the ```final``` variable

- **Local Scope:**
  - No init. + decl. + init. later in the same func: Treated as first time init. => VALID
  - Declaration and init. can be done separately.

- **Global Scope:**
  - CTE :: cannot assign value to a final static variable, variable 'e' might not have been initialized.
  - Declaration and init. cannot be done separately.

### Concept #10: ```static``` variables

- ```static``` objects are stored in the static pool.
- ```static``` objects can access the static and non-static objects.
- Non-static objects cannot access static objects.
- Objects are created using the `new` keyword.


### Concept #11:

- Java and C++ are not pure OOP languages.
- Python exhibits both OOP and POP behaviour, but in design it is OOP.



# SQL

### Concept 1: DDL, DML, TCL

- DDL is used by Database Admin to define schemas of the DB.
- DML is used by end users to conduct transactions.
- TCL - Transaction Control Language

### Concept #2: CRUD Commands

1. `INSERT INTO` - Add values into the table -> DML
2. `COMMIT` - Save operation -> TCL
3. `ROLLBACK` - Undo operation -> TCL
  - Has no changes if the data is not committed.
  - Only changes the data upon commit.
  - Most editors have the `AUTOCOMMIT` feature enabled by default. To disable: `SET AUTOCOMMIT = 0`

- **TCL only works on DML, not DDL.**

### Concept #3: NULL

- Numeric values are treated as max, and NULL is treated as minimum.
- Comparison opeartor ignores NULL.
- `IS NULL` is known as the NULL test operator.

### Concept #4: Aggregation and Sub-queries

- Aggregated columns cannot be returned together with non-aggregated columns.
- However, subqueries can be used to overcome this.

Example:

```sql
 SELECT FACULTY_NAME, FACULTY_SALARY
 FROM FACULTY
 WHERE FACULTY_SALARY = SELECT MAX(FACULTY_SALARY) FROM FACULTY;
```

### Concept #5: WHERE vs HAVING

- WHERE acts on individual rows / independent columns. Does not work on aggregated columns (i.e. after aggregation).
  
  Example: 
  ```sql
  FROM FACULTY 
  GROUP DEPT;
  ```

Example: Group all departments and sort by ascending order.

```sql
SELECT DEPT, MAX(FACULTY_SALARY) -- 3
FROM FACULTY                     -- 1
GROUP DEPT                       -- 2
ORDER BY DEPT;                   -- 4
```

Example: Display the dept and sum of salaries in each dept, related to employees whose salary is more than 3000 in descending order of the dept name wherein the sum of salaries are greater than 6000.

```sql
SELECT DEPT, SUM(FACULTY_SALARY)  -- 5
FROM FACULTY                      -- 1
WHERE FACULTY_SALARY > 3000       -- 2
GROUP BY DEPT                     -- 3
HAVING SUM(FACULTY_SALARY) > 6000 -- 4
ORDER BY DEPT DESC;               -- 6
```

