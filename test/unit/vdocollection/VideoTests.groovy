package vdocollection

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class VideoTests {

    void testCreateVideo(){
		def vdo = new Video(title:'New video',url:'http://www.youtube.com/watch?v=0DYptJTSF-k',description:'Test create video')
		assert vdo.title == "New video"
		assert vdo.url == "http://www.youtube.com/watch?v=0DYptJTSF-k"
		assert vdo.description == "Test create video"
	}
}
