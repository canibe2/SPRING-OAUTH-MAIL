import './App.css';
import { Route, Routes } from 'react-router-dom';
import SignIn from 'views/Authentication/SignIn';
import SignUp from 'views/Authentication/SignUp';
import { CookiesProvider } from 'react-cookie';
import OAuth from 'views/Authentication/OAuth';

function App() {


  return (
    <CookiesProvider>
    <Routes>
      <Route path="/" element={<></>} />
      <Route path='/auth'>
        <Route path='sign-up' element={<SignUp/>}/>
        <Route path='sign-in' element={<SignIn/>}/>
        <Route path='oauth-response/:token/:expirationTime' element={<OAuth/>} />
      </Route>
    </Routes>
    </CookiesProvider>
  );
};

export default App;
