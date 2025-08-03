import React from 'react';

const UserPage = () => {
  const flights = [
    { id: 1, from: 'Bengaluru', to: 'Delhi', time: '10:00 AM' },
    { id: 2, from: 'Mumbai', to: 'Kolkata', time: '3:45 PM' }
  ];

  const handleBook = (flight) => {
    alert(`Ticket booked from ${flight.from} to ${flight.to} at ${flight.time}`);
  };

  return (
    <div>
      <h2>Book Flights</h2>
      <ul>
        {flights.map(f => (
          <li key={f.id}>
            {f.from} → {f.to} at {f.time}
            <button style={{ marginLeft: '1rem' }} onClick={() => handleBook(f)}>Book</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserPage;

