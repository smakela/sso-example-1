import codeisdesign.example.sso.security.User;

class BootStrap {

    def init = { servletContext ->
		new User(
				username:"codeisdesign", 
				password:"password",
			 	enabled:true,
				accountExpired:false,
				accountLocked:false,
				passwordExpired:false
			).save(flush:true)
    }
    def destroy = {
    }
}
