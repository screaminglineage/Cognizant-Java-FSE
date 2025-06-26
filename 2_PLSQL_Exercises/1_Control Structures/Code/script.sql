SET SERVEROUTPUT ON;

CREATE Table Customers (
    CustomerID Number Primary Key,
    Name VarChar2(50),
    Age Number,
    LoanInterestRate Number,
    Balance Number,
    IsVIP Boolean
);

INSERT INTO Customers VALUES (1, 'Alice', 70, 10, 20000, False);
INSERT INTO Customers VALUES (2, 'Bob', 50, 5, 15000, False);
INSERT INTO Customers VALUES (3, 'Jake', 62, 15, 5000, False);
INSERT INTO Customers VALUES (4, 'Mary', 30, 20, 1000, False);
COMMIT;

BEGIN
  DBMS_OUTPUT.PUT_LINE('Original Table:');
END;
/
SELECT * FROM customers;


-- Scenario 1
BEGIN
  FOR rec IN (SELECT CustomerID, LoanInterestRate FROM Customers WHERE Age > 60) LOOP
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
END;
/

BEGIN
  DBMS_OUTPUT.PUT_LINE('Scenario 1:');
END;
/
SELECT * FROM customers;

-- Scenario 2
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = true
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

BEGIN
  DBMS_OUTPUT.PUT_LINE('Scenario 2:');
END;
/
SELECT * FROM customers;

CREATE Table Loans(
    LoanID Number Primary Key,
    CustomerID Number References Customers(CustomerID),
    AmountDue Number,
    DueDate Date
);

INSERT INTO Loans VALUES (1, 2, 5000, TO_DATE(SYSDATE + 10, 'DD-MON-YY'));
INSERT INTO Loans VALUES (2, 2, 3000, TO_DATE(SYSDATE + 20, 'DD-MON-YY'));
INSERT INTO Loans VALUES (3, 4, 10000, TO_DATE(SYSDATE + 15, 'DD-MON-YY'));
INSERT INTO Loans VALUES (4, 3, 1000, TO_DATE(SYSDATE + 60, 'DD-MON-YY'));
SELECT * FROM Loans;

-- Scenario 3
BEGIN
    FOR rec in (
        SELECT LoanID, CustomerID, AmountDue, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer: ' || rec.CustomerID ||
        ', your loan with ID: ' || rec.LoanID || ' of amount ' || rec.AmountDue ||
        ' is due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/

EXIT;

