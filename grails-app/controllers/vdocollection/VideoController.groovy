package vdocollection

class VideoController {

    def index() { 
		def videos = video.findAll()
		[videos : videos]
	}
}
