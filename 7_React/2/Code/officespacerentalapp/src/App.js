import React from 'react';
import './App.css';

function App() {
  // Page heading
  const heading = "Office Space For Rent";

  // Office data
  const offices = [
    {
      name: 'Tech Park View',
      rent: 55000,
      address: 'HSR Layout, Bengaluru',
      image: 'https://officebanao.com/wp-content/uploads/2022/10/Modern-office-design-3.jpg'
    },
    {
      name: 'City Central Tower',
      rent: 85000,
      address: 'Connaught Place, Delhi',
      image: 'https://uploads-ssl.webflow.com/5e1f1da7fa3d448bab479847/63e50dceef8527e6d71a05ed_AdobeStock_339067151.png'
    },
    {
      name: 'Cyber Gateway',
      rent: 60000,
      address: 'HITEC City, Hyderabad',
      image: 'https://www.decorilla.com/online-decorating/wp-content/uploads/2023/05/correcto.jpg'
    }
  ];

  return (
    <div>
      <h1>{heading}, At Affordable Ranges</h1>

      {offices.map((office, index) => (
        <div key={index} style={{ border: '1px solid #ccc', margin: '1rem', padding: '1rem' }}>
          <img src={office.image} alt={office.name} width="300" />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{ color: office.rent > 60000 ? 'green' : 'red' }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;


