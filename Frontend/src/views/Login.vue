<template>
  <div id="login-page">
    <Navbar/>
    <div class="container">
      <div class="row">
        <div class="col-4"></div>
        <div class="col-4">
          <div class="login-form panel">
            <div class="form-group">
              <label for="usr">Username:</label>
              <input type="text" v-model="usernameOrEmail" class="form-control" id="usr">
            </div>
            <div class="form-group">
              <label for="pwd">Password:</label>
              <input type="password" v-model="password" class="form-control" id="pwd">
            </div>
            <button v-on:click="handleSubmit()">Login</button>
          </div>
        </div>
        <div class="col-4"></div>
      </div>
    </div>
  </div>
</template>

<script>
import router from '../router';
import { userService } from '../_services';
import Vue from 'vue';
import Navbar from '@/components/Navbar.vue';

export default {
  components: {
    Navbar,
  },
  data() {
    return {
      usernameOrEmail: '',
      password: '',
    };
  },
  created() {
    // reset login status
    userService.logout();

    // get return url from route parameters or default to '/'
    this.returnUrl = this.$route.query.returnUrl || '/';
  },
  methods: {
    handleSubmit(e) {
      this.submitted = true;
      const { usernameOrEmail, password } = this;

      // stop here if form is invalid
      if (!(usernameOrEmail && password)) {
        alert('username or email is invalid')
        return;
      }

      this.loading = true;
      userService.login(usernameOrEmail, password)
        .then(
          (user) => router.push('/teller'),
          (error) => {
            this.error = error;
            this.loading = false;
            alert("Invalid credentials");
          },
        );
    },
  },
};
</script>

<style lang="scss">
#login-page {
  padding-top: 50px;
}

.login-form {
  padding-left: 10px;
  padding-right: 10px;
}
</style>

