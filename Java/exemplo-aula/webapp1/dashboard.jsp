<html> 

    <head>
        <title>Dashboard</title>
    </head>

    <body>  
        <%       

            String nome = (String)session.getAttribute("nome_usuario");     
            out.print("Você continua logada(o), " +  nome);  
      
        %> 
			<br>

        <a href="home.jsp">Home</a>  
        <a href="dashboard.jsp">Dashboard</a> 
        <a href="logout.jsp">Sair</a>  
    
   
    </body>  
</html>  