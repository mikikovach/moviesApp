
import React, { useState } from "react";

const Form = ({ setUrl}) => {

    const [inputValue, setInputValue] = useState('');
    // const [url, setUrl] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        setUrl('http://localhost:8080/catalogue/' + `${inputValue}`);

      };

      
return (
  <form onSubmit={handleSubmit}>
    <input type="text" value={inputValue} onChange={(e) => setInputValue(e.target.value)} placeholder="Enter user" />
    <button  type="submit">Fetch</button>
  </form>
);
    



}



export default Form;

