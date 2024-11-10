@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
}
