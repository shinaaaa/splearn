package tobyspring.splearn.domain;

public class MemberFixture {

    public static MemberRegisterRequest createMemberRegister(String email) {
        return new MemberRegisterRequest(email, "shin", "secret");
    }

    public static MemberRegisterRequest createMemberRegister() {
        return createMemberRegister("shin@splearn.app");
    }

    public static PasswordEncoder createPasswordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(String password) {
                return password.toUpperCase();
            }

            @Override
            public boolean matches(String password, String encodedPassword) {
                return encode(password)
                        .equals(encodedPassword);
            }
        };
    }
}
