import { useState } from 'react'
import './App.css'

function App() {
  const [color, setColor] = useState('--');

  function handleClick(c) {
    setColor(c);
    document.querySelector("body").style.backgroundColor = c
  }


  return (
    <>
      <h1 style={{ color: "black" }}>
        You have clicked on {color} button
      </h1>

      <button className="red" onClick={(e) => { handleClick('red') }}>Red</button >
      <button className="blue" onClick={(e) => { handleClick('blue') }}>Blue</button>
      <button className="green" onClick={(e) => { handleClick('green') }}>Green</button>
      <button className="yellow" onClick={(e) => { handleClick('yellow') }}>Yellow</button>
    </>
  )
}

export default App
