
import React from "react";

function CatalogueItem(props) {
  return (
    <div className="item">
      <h1>{props.title}</h1>
      <p> Rating : {props.rating}</p>
      <p id="descr"> Description: <br/> {props.description}</p>
    </div>
  );
}

export default CatalogueItem;