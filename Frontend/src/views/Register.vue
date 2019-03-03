<template>
  <div id="register-page">
    <Navbar/>
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <div class="register-form panel">
            <div class="form-group">
              <label for="usr">Username:</label>
              <input type="text" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="pwd">Password:</label>
              <input type="password" class="form-control" id="pwd">
            </div>
            <div class="form-group">
              <label for="pwd">Repeat Password:</label>
              <input type="password" class="form-control" id="pwd">
            </div>
            <a class="btn btn-primary" href="/account">Register</a>
          </div>
        </div>
        <div class="col-4"></div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import Navbar from '@/components/Navbar.vue';

export default {
  components: {
    Navbar,
  },
};
</script>

<style lang="scss">
#register-page {
  padding-top: 50px;
}

.register-form {
  padding-left: 10px;
  padding-right: 10px;
}
</style>

