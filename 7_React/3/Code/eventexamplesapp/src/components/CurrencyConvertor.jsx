import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = (e) => {
    e.preventDefault();

    let converted = 0;
    if (currency === 'Euro') {
      converted = amount * 101.06;
      alert(`Converting to ${currency} Amount is ${converted}`);
    } else {
      alert(`Unsupported currency: ${currency}`);
    }

  };

  return (
    <div style={{ marginTop: "2rem" }}>
      <h2 style={{ color: 'green' }}>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
      <label style={{ display: 'inline', marginBottom: '6px' }}>Amount:</label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          style={{ marginLeft: '12px', marginBottom: '12px' }}
        /><br />
      <label style={{ display: 'inline', marginBottom: '6px' }}>Currency:</label>
        <input
          type="text"
          defaultValue={currency}
          onChange={(e) => setCurrency(e.target.value)}
          style={{ marginLeft: '12px', marginBottom: '12px' }}
        /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default CurrencyConvertor;

