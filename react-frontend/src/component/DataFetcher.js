import React, { useState, useEffect } from 'react';
import axios from 'axios';
import CatalogueItem from './CatalogueItem';

const DataFetcher = ({ url }) => {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);

  // useEffect(() => {
  //   axios.get('http://localhost:8080/catalogue/joca')
  //     .then(response =>  setData(response.data)) // Set the response data to state
  //     .catch(error => setError(error) // Handle the error if the request fails
  //     );
  // }, []); // Empty dependency array means this effect runs once when the component mounts

  useEffect(() => {
    if (url) {
      fetch(url)
        .then(response => response.json())
        .then(data => setData(data))
        .catch(error => setError(error));
    }
  }, [url]);

  return (
    <div>
      {error && <p>Error: {error.message}</p>}
      {data ? (
        <div>
          {/* <h1>Data from API:</h1> */}
          <ul>
            {data.map(item => ( <CatalogueItem key={item.name} title={item.name} description={item.description} rating={item.rating} />
              
            ))}
          </ul>
        </div>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

export default DataFetcher;
