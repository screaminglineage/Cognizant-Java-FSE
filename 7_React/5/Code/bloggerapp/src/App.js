import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const showAll = true;

  return (
    <div className="container">
      {showAll && <CourseDetails />}
      {showAll ? <BookDetails /> : <p>Books are hidden</p>}
      {!showAll && <BlogDetails />}
      {showAll && <BlogDetails />}
    </div>
  );
}

export default App;


