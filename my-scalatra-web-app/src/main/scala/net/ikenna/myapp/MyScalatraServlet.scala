package net.ikenna.myapp

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends MyScalatraWebAppStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
        Say <a href="hello-scalate-ssp">hello to Scalate with ssp</a>.
      </body>
    </html>
  }
  
}
