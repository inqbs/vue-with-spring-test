<template>
  <div class="test">
    <p>This is test page. Result is {{value}}</p>
    <p><time :datetime="date">{{date}}</time></p>
    <p><button @click="changeValue">changeValue</button></p>
    axios
    follow-redirects
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Test',
  data() {
    return {
      value: 0,
      date: null
    }
  },
  methods:{
    changeValue(){
      const vm = this
      axios.get('/data').then(res=>{
        vm.value = res.value
        vm.date = res.date
      })
    }
  }
}
</script>