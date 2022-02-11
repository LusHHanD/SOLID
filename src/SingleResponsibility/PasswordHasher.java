package SingleResponsibility;

public class PasswordHasher
{
    public String hashAndSavePassword(String password)
    {
        hashPassword();
        savePassword();
        return password;
    }

    public void hashPassword()
    {
        //Password Hash
    }
    public void savePassword()
    {
        //Password Save
    }
}