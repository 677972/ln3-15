package kosta.lessons.day6;

import java.math.BigDecimal;

public class User6
{
    private long id;
    private String imageUrl;
    private String name;
    private String nick;
    private String description;
    private String location;
    private int followingCount;
    private int followersCount;
    private BigDecimal money;
    private String FIO;

    //метод Alt + Insert / Constructor
    public User6(long id, String imageUrl, String name, String nick, String description, String location, int followingCount, int followersCount, BigDecimal money, String FIO)
    {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.nick = nick;
        this.description = description;
        this.location = location;
        this.followingCount = followingCount;
        this.followersCount = followersCount;
        this.money = money;
        this.FIO = FIO;
    }

    //метод Alt + Insert / Getter
    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getFIO() {
        return FIO;
    }

    //метод Alt + Insert / equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User6 user6 = (User6) o;

        if (id != user6.id) return false;
        if (followingCount != user6.followingCount) return false;
        if (followersCount != user6.followersCount) return false;
        if (imageUrl != null ? !imageUrl.equals(user6.imageUrl) : user6.imageUrl != null) return false;
        if (!name.equals(user6.name)) return false;
        if (!nick.equals(user6.nick)) return false;
        if (description != null ? !description.equals(user6.description) : user6.description != null) return false;
        if (location != null ? !location.equals(user6.location) : user6.location != null) return false;
        if (money != null ? !money.equals(user6.money) : user6.money != null) return false;
        return FIO.equals(user6.FIO);
    }

    //метод Alt + Insert / equals() and hashCode()
    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + name.hashCode();
        result = 31 * result + nick.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + followingCount;
        result = 31 * result + followersCount;
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + FIO.hashCode();
        return result;
    }

}
