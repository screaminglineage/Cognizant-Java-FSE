import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 90 },
    { name: 'Rahul', score: 65 },
    { name: 'Jadeja', score: 75 },
    { name: 'Shami', score: 60 },
    { name: 'Pant', score: 88 },
    { name: 'Ashwin', score: 50 },
    { name: 'Bumrah', score: 92 },
    { name: 'Gill', score: 45 },
    { name: 'Surya', score: 77 },
    { name: 'Iyer', score: 55 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
