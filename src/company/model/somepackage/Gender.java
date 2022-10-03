package company.model.somepackage;

public class Gender {
    public enum Genderenum {

        MAN("Male"),
        WOMAN("Female");

        private String gen;


        Genderenum(String gender) {
            this.gen = gender;
        }


        public String getGen() {
            return gen;
        }

        @Override
        public String toString() {
            return gen + '\'';
        }
    }

    public enum Gendere {
        WOMAN, MAN
    }
}
