
import { Route, Routes } from 'react-router-dom';
import './App.css';
import About from './components/About';
import { Contact } from './components/Contact';
//import Footer from './components/Footer';
import Home from './components/Home';
import Navbar from './components/Navbar';



function App() {
  return (
    <>
 <div>
     <Navbar/> 
       <div>
            <Routes>
           
               <Route path='/' element={<Home/>}/>
              <Route path='about' element={<About/>}/>
               <Route path='contact' element={<Contact/>}/>
            
      
              </Routes>
        </div>
   
</div>
   
    </>
  );
}

export default App;
