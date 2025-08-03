function BookDetails() {
  const books = [
    { id: 100, title: "Master React", price: 670 },
    { id: 101, title: "Deep Dive into Angular 11", price: 800 },
    { id: 102, title: "Mongo Essentials", price: 450 }
  ];

  return (
    <div className="st2">
      <h1>Book Details</h1>
      {books.map((b) => (
          <div key={b.id}>
          <h3>{b.title}</h3>
          <h4>{b.price}</h4>
          </div>
      ))}
    </div>
  );
}

export default BookDetails;

