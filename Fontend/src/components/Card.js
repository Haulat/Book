import React, { useState } from 'react'
import Footer from './Footer';
import Modal from './Modal';
 const Card = ({book}) => {
    const[show,setShow]=useState(false);
    const[bookItem,setItem]=useState();
  return (
    <>
    {
         book.map((item)=>{
            let thumbnail=item.volumeInfo.imageLinks && item.volumeInfo.imageLinks.smallThumbnail;
           
            if(thumbnail!== undefined)
            {
                return(
                    <>
             <div class="card" onClick={()=>{setShow(true);setItem(item)}}>
                    <img src={thumbnail}  alt=""/>
                    <div className="bottom">
                        <h3 className="tittle">{item.volumeInfo.title}</h3>
                        <p className="amount">&#8377;3296</p>
                     </div>
                   
                </div>



















                
               <Modal show={show} item={bookItem} onClose={()=>setShow(false)}/>
             
                </>
                )
            }
           
    })
}
   
    </>
  )
}
export default Card;
