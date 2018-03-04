<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="container">
		<!-- Brand -->
		<a class="navbar-brand" href="#">Hello World</a>
		<!-- Links -->
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="/hello">Hello</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Link 2</a></li>
		</ul>
		<ul class="navbar-nav">
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">${user}</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Profile</a> 
					<a class="dropdown-item" href="#">Link 2</a>
					<a class="dropdown-item" href="/logout"><i class="fas fa-sign-out-alt"></i> Logout</a>
				</div>
			</li>
		</ul>
	</div>
</nav>