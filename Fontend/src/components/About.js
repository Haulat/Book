import React from 'react'
import Footer from './Footer';

 const About = () => {
  return (
    <>
    <div className='juu'>
    <img src="./image/aboutbackground.jpg" alt="" />  
    </div>

    <div className='back'>
        <div className='upback'>
        <p className=' aabout'><br/>
           <h1>About Our Store</h1><br/>We offer two distinct services for online shopping:
Mail Orders - Shipped directly to your home via UPS.
In-Store Pickup - Order and pay online, then pick up in store.<br/><br/>
<h1>Online Comparison Book</h1><br/>
Our Price Comparison feature makes it easier than ever for Clark students to get a great deal on textbooks. We show our prices right
alongside other online retailers. Choose the lowest price, greatest convenience, or safest bet- then our one-stop-shop makes it easy to
checkout from each retailer, saving you valuable time. Please note: the in-store pickup service cannot be used on other retailers' sites.

        </p>
        </div>
    <div className='downback'>
        
        <img src="./image/captured.png" alt=""/>
    
    </div>
    </div>
    
    <Footer/>
    </>
  )
}
export default About;
