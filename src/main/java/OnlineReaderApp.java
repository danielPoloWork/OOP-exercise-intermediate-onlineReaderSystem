import interfaces.BookRepositoryInterface;
import interfaces.UserRepositoryInterface;
import repositories.BookRepository;
import repositories.UserRepository;
import services.LibraryService;
import services.UserManagerService;
import services.UserService;
import utils.PasswordValidatorUtil;

public class OnlineReaderApp {

  private final UserRepositoryInterface userRepository;
  private final BookRepositoryInterface bookRepository;
  private final UserService userService;
  private final UserManagerService userManagerService;
  private final LibraryService libraryService;
  private final PasswordValidatorUtil password;

  public OnlineReaderApp() {
    this.userRepository     = new UserRepository();
    this.bookRepository     = new BookRepository();
    this.userService        = new UserService(this.userRepository);
    this.userManagerService = new UserManagerService(this.userRepository);
    this.libraryService     = new LibraryService(this.userRepository, this.bookRepository);
    this.password           = new PasswordValidatorUtil();
  }

  public static void main(String[] args) {
    OnlineReaderApp app = new OnlineReaderApp();
  }
}
