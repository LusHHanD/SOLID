package SingleResponsibility;

public interface IEmailSender {
    public void sendEmail(Employee employee, IEmailContent content);
}
