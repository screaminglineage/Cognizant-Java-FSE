// src/App.jsx
import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function UserGreeting() {
    return <h1>Welcome Back!</h1>
}

function GuestGreeting() {
    return <h1>Please Sign Up</h1>
}

function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
        return <UserGreeting/>
    } else {
        return <GuestGreeting/>
    }
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ padding: '2rem' }}>
      <h1>Ticket Booking App</h1>

      <Greeting  isLoggedIn={isLoggedIn}/>
      {isLoggedIn ? (
        <>
          <button onClick={handleLogout}>Logout</button>
          <UserPage />
        </>
      ) : (
        <>
          <button onClick={handleLogin}>Login</button>
          <GuestPage />
        </>
      )}
    </div>
  );
}

export default App;

