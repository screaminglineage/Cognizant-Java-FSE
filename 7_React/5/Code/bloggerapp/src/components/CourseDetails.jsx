function CourseDetails() {
  const showReact = true;
  const courses = [
    { name: "Angular", date: "4/5/2021" },
    showReact && { name: "React", date: "6/3/2021" }
  ].filter(Boolean);

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {courses.map((c, i) => (
        <div key={i}>
          <h3>{c.name}</h3>
          <div>{c.date}</div>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;

