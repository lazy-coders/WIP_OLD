package es.lazycoders.wip



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testConstraints() {
		def user = new User(
						fullName: "John Smith",
						username: "johnsmth",
						password: "password",
						email: "john@smith.es",
						enabled: true,
						accountExpired: false,
						accountLocked: false,
						passwordExpired: false)

		assert user.validate()

		user.fullName = null
		user.username = null
		user.password = null
		user.email = "plain"
		
		assert !user.validate()
		//assert "nullable" == user.errors["fullName"]
		//assert "nullable" == user.errors["username"]
		//assert "nullable" == user.errors["password"]
		//assert "email" == user.errors["email"]

    }

}
