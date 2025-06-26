SET SERVEROUTPUT ON;

CREATE TABLE BankAccounts (
  AccountID   NUMBER PRIMARY KEY,
  CustomerID  NUMBER,
  Balance     NUMBER(10, 2)
);

INSERT INTO BankAccounts VALUES (201, 1, 20000);
INSERT INTO BankAccounts VALUES (202, 2, 15000);
INSERT INTO BankAccounts VALUES (203, 3, 10000);
COMMIT;

CREATE PROCEDURE TransferFunds(from_acc IN NUMBER, to_acc IN NUMBER, amount IN NUMBER) AS balance NUMBER;
BEGIN
  SELECT Balance INTO balance
  FROM BankAccounts
  WHERE AccountID = from_acc;

  IF balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account');
  END IF;

  UPDATE BankAccounts
  SET Balance = Balance - amount
  WHERE AccountID = from_acc;

  UPDATE BankAccounts
  SET Balance = Balance + amount
  WHERE AccountID = to_acc;

  COMMIT;
END;
/

SELECT * FROM BankAccounts;

BEGIN
    TransferFunds(201, 202, 5000);
    dbms_output.PUT_LINE('After Update:');
END;
/
SELECT * FROM BankAccounts;

EXIT;
