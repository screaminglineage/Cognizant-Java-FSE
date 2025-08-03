import React from 'react';

const GuestPage = () => {
  const flights = [
    { id: 1, from: 'Bengaluru', to: 'Delhi', time: '10:00 AM' },
    { id: 2, from: 'Mumbai', to: 'Kolkata', time: '3:45 PM' }
  ];

  return (
    <div>
      <h2>Browse Flights</h2>
      <ul>
        {flights.map(f => (
          <li key={f.id}>
            {f.from} → {f.to} at {f.time}
          </li>
        ))}
      </ul>
      <p><strong>Login to book your tickets.</strong></p>
    </div>
  );
};

export default GuestPage;

