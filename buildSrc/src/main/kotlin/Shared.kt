import org.gradle.api.Plugin
import org.gradle.api.Project
    
open class Shared: Plugin<Project> {
    override fun apply(project: Project) {
        project.configureAndroid()
        project.configureDependencies()
    }
}
