<html> 

    <head>
        <title>Home</title>
    </head>

    <body>  
    	<%   
 
            String nome = request.getParameter("usuario"); 
            String senha = request.getParameter("senha");
                
            session.setAttribute("nome_usuario", nome);  
            out.print("Ol� " + nome + " sua senha � " + senha);

        %> 
		<br/>
        <a href="home.jsp">Home</a>  
        <a href="dashboard.jsp">Dashboard</a> 
        <a href="logout.jsp">Sair</a>  
    
   
    </body>  
</html>  