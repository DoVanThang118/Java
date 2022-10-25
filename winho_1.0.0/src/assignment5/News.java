package assignment5;

public class News {
    int Id;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        Id = id;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public int[] RateList = new int[3];

    public void Calculate(){
        float t = 0;
        for (int r: RateList){
            t+=r;
        }
        AverageRate = t/3;
    }
}
