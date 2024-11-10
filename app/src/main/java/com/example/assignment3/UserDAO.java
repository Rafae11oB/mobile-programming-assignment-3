@Dao
public interface UserDao {
    @Insert
    void insert(User user);

    @Query("SELECT * FROM user")
    LiveData<List<User>> getAllUsers();
}
