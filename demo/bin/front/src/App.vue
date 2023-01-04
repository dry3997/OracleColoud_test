<template>
  <div id="app">
    <!--empList찾을수없는경우 여기서 사용해야 출력됌.-->
    <empList></empList>
  </div>
</template>

<script>
//components name등록하기
import EmpList from './components/EmpList.vue'

export default {
  name: 'App',
  components: {
    EmpList //이름 같도록..
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
