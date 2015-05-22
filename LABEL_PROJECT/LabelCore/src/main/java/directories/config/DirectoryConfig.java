package directories.config;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jackson on 21.05.2015.
 */
@XmlRootElement(name = "doc")
public class DirectoryConfig {
    private List<DirectoryConfigItem> directoryConfigItems;

    @XmlElement(name = "Directory")
    @XmlElementWrapper(name = "DirectoryConfig")
    public List<DirectoryConfigItem> getDirectoryConfigItems() {
        return directoryConfigItems;
    }

    public void setDirectoryConfigItems(List<DirectoryConfigItem> directoryConfigItems) {
        this.directoryConfigItems = directoryConfigItems;
    }

}
