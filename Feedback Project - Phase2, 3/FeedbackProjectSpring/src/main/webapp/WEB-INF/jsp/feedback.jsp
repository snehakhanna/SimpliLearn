<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Feedback Form</title>
      <style>
         body {font-family: Arial;}
         * {box-sizing: border-box;}
         .center {margin-left: auto; margin-right: auto;}
         input[type=text], input[type=email] { width: 50%; padding: 15px; box-sizing: border-box; }
      </style>
   </head>
   <body>
      <form method="post" action="/feedback">
         <div align="center">
            <h1>Give us your Feedback !</h1>
            <p>Trust your instincts</p>
            <h5>Enter your feedback in range of 1 to 5 (1 to 5 range represents from Unsatisfied to Highly Satisfied</h5>
            <table style="width:100%; margin-left:20%; margin-right:30%;" class="center">
               <tr>
                  <td>Name:</td>
                  <td><input type="text" name="customerName" placeholder="Enter your name" required /></td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Email:</td>
                  <td><input type="email" name="customerEmail" placeholder="Enter your email Id" required /></td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Country:</td>
                  <td>
                     <input type="text" name="country"
                        placeholder="Enter your country" required>
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Product Quality:</td>
                  <td>
                     <input type="text"
                        name="productQuality"
                        placeholder="Rate our product quality experience" required>
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Service Quality:</td>
                  <td>
                     <input type="text"
                        name="serviceQuality"
                        placeholder="Rate our service quality experience" required />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Order Accuracy:</td>
                  <td>
                     <input type="text"
                        name="orderAccuracy"
                        placeholder="Rate our order accuracy experience" required />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Timeliness:</td>
                  <td>
                     <input type="text" name="timeliness"
                        placeholder="Rate our commitment to time" required />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Value for Money:</td>
                  <td>
                     <input type="text"
                        name="valueForMoney"
                        placeholder="Rate our value for money experience" required />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td>Any suggestions?:</td>
                  <td>
                     <input type="text"
                        name="customerSuggestions" placeholder="Enter text here" />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td></td>
               </tr>
               <tr>
                  <td></td>
                  <td>
                     <input type = "submit" value = "Submit Response"> 
                  </td>
               </tr>
            </table>
         </div>
      </form>
   </body>
</html>