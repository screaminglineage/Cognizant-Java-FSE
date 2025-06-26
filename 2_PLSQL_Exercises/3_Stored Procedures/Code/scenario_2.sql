SET SERVEROUTPUT ON;

CREATE TABLE Employees (
  EmpID    NUMBER PRIMARY KEY,
  Name     VARCHAR2(100),
  DeptID   NUMBER,
  Salary   NUMBER(10, 2)
);

INSERT INTO Employees VALUES (1, 'Alice', 10, 50000);
INSERT INTO Employees VALUES (2, 'Bob', 10, 60000);
INSERT INTO Employees VALUES (3, 'Carol', 20, 55000);
COMMIT;

CREATE PROCEDURE UpdateEmployeeBonus(dept_id IN NUMBER, bonus_percent IN NUMBER) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE DeptID = dept_id;
  COMMIT;
END;
/


SELECT * FROM Employees;

BEGIN
    UpdateEmployeeBonus(10, 12);
    dbms_output.PUT_LINE('After Update:');
END;
/
SELECT * FROM Employees;

EXIT;
