function BlogDetails() {
  const blogAvailable = true;

  const blog = {
    title: "React Learning",
    author: "Stephen Biz",
    body: "Welcome to learning React!",
    installation: "You can install React from npm.",
    contributor: "Schwezdenier"
  };

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {
        blogAvailable ? (
          <>
            <h2>{blog.title}</h2>
            <h3>{blog.author}</h3>
            <p>{blog.body}</p>
            <h3>Installation</h3>
            <p><strong>{blog.contributor}</strong></p>
            <p>{blog.installation}</p>
          </>
        ) : (
          <p>No blog content available</p>
        )
      }
    </div>
  );
}

export default BlogDetails;

