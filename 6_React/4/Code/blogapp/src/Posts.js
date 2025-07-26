import React from 'react';

class Posts extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                this.setState({ posts: data });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        console.log(info);
        console.error("Error caught in component:", error);
        this.setState({ hasError: true });
        alert(`An error occurred: ${error.message}`);
    }

    render() {
        return (
            <div>
            <h2>Posts</h2>
            <button onClick={this.loadPosts}>Load Posts</button>
            <div>
            {this.state.posts.map(post => (
                <div>
                <h3>{post.title}</h3>
                <p>{post.body}</p>
                </div>
            ))}
            </div>
            </div>
        );
    }
}

export default Posts;
