import React from 'react';

function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;
  return (
    <div>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
}

function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;
  return (
    <div>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
}

const IndianPlayers = () => {
  const players = ['Virat', 'Rohit', 'Rahul', 'Jadeja', 'Shami', 'Pant'];

  const t20players = ['Virat', 'Rohit', 'Surya'];
  const ranjiTrophyPlayers = ['Pujara', 'Rahane', 'Saha'];

  const allPlayers = [...t20players, ...ranjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <OddPlayers players={players} />
      <h2>Even Players</h2>
      <EvenPlayers players={players} />

      <h3>Merged Players</h3>
      <ul>
        {allPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
