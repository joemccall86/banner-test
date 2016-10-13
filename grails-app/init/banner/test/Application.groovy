package banner.test

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.boot.ResourceBanner
import org.springframework.core.io.ClassPathResource

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        def app = new GrailsApp(Application)
        app.banner = new ResourceBanner(new ClassPathResource('banner.txt'))
        app.run(args)
    }
}