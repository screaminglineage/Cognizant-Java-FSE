SET SERVEROUTPUT ON;

CREATE TABLE SavingsAccounts (
  AccountID   NUMBER PRIMARY KEY,
  CustomerID  NUMBER,
  Balance     NUMBER(10, 2)
);

INSERT INTO SavingsAccounts VALUES (101, 1, 10000.00);
INSERT INTO SavingsAccounts VALUES (102, 2, 15000.00);
INSERT INTO SavingsAccounts VALUES (103, 3, 8000.00);
COMMIT;

SELECT * FROM SavingsAccounts;

CREATE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  FOR acc IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = acc.AccountID;
  END LOOP;
  COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
    dbms_output.PUT_LINE('After Update:');
END;
/
SELECT * FROM SavingsAccounts;

EXIT;
