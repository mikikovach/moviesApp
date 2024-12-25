
import './App.css';
import React, { useState, useEffect } from 'react';
import CatalogueItem from './component/CatalogueItem';
import DataFetcher from './component/DataFetcher';
import Form from './component/Form';
import Header from './component/Header';

function App() {

  const [url, setUrl] = useState('');
  return (
    
    <div className="App">
      <Header />
      <Form setUrl={setUrl}/>
      <DataFetcher url={url}/>
    </div>
  );
}

export default App;
