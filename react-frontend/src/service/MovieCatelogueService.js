import axios from 'axios';

const CATALOGUE_SERVICE_BASE_URL = 'localhost:9191/catalogue/';

const USER_ID = 'miki'

class MovieCatalogueService {

    getCatalogueItems(){
       return  axios.get(CATALOGUE_SERVICE_BASE_URL+USER_ID);
    }
    
}

export default MovieCatalogueService;