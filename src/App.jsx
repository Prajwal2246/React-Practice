import React, { useState } from "react";
import "./App.css";

const App = () => {
  let [count, setCount] = useState(0);
  let [error,setError]=useState("");

  const handleIncr = () => {
    setCount(count + 1);
    if(error) setError("");
  };

  const handleDecr = () => {
    if(count === 0){
      setError("cannot be decrement below zero");
      return;
    }
    setCount(count - 1);
    if(error) setError("");
  };
  return (
    <div className="main">
      <div className="count">{count}</div>
      <div>
        <button onClick={handleIncr}>Increment</button>
        <button onClick={handleDecr}>Decrement</button>
      </div>
      {error && <div className="error-msg">{error}</div>}
    </div>
  );
};

export default App;
